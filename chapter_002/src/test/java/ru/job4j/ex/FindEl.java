package ru.job4j.ex;

public class FindEl {
    public int indexOf(String[] list, String key) throws ElementNotFoundException{
        int res = -1;
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(key)) {
                res = i;
                break;
            }
        }
        if (res == -1) {
            throw new ElementNotFoundException("Element is not found");
        }
        return res;
    }

    public static void main(String[] args) {
        String[] simpson = {"Bart", "Lisa", "Marge", "Homer", "Maggie"};
        String flanders = "Ned";
        FindEl find = new FindEl();
        try {
            System.out.println(find.indexOf(simpson, flanders));;
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}

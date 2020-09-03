import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Scratch {



    public static void main(String[] args) throws IOException {

        List<String> strings;
        strings = readfile("C:\\Users\\shamm\\Documents\\CSC\\csc130\\name.txt");
        List<String>[] lists = splitMerge(strings);
        traverse(lists[0]);
        traverse(lists[1]);
        strings = merge(lists[0],lists[1]);
        System.out.println("\n\nafter merging\n\n");
        traverse(strings);

    }
    private static List<String> merge(List<String> x1,List<String> x2){
         x1.addAll(x2);
         return x1;
    }
    private static void traverse(List<String> lists) {
        System.out.println("\nStart\n");
        for (String s : lists) {
            System.out.println(s);
        }
        System.out.println("\nEnd\n");
        System.out.println();

    }

    static List<String> readfile(String pathToFile) throws IOException {
        File file = new File(pathToFile);
        return Files.readAllLines(file.toPath());
    }

    static List<String>[] splitMerge(List<String> strings) {
        int len = strings.size();
        List<String> arr[] = new ArrayList[2];
        for (int i = 0; i < 2; i++) {
            arr[i] = new ArrayList<String>();
        }
        int i = 0;
        for (; i < len / 2; i++) {
            arr[0].add(strings.get(i));
        }
        for (int j = i; j < len; j++) {
            arr[1].add(strings.get(j));
        }
        return arr;
    }


}
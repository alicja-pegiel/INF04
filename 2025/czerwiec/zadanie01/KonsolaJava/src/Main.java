import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int[] liczbaWystapien = new int[50];
    static Set <Integer> zestawLiczb = new HashSet<>(6);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile wygenerować losowań?");
        int liczbaLosowan = scanner.nextInt();
    }
}
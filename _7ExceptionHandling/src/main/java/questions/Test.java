package questions;

import java.io.IOException;
public class Test {
    public static void main(String[] args) {
        try (Resource r  = new Resource()) {
            r.action();
        } catch (IOException ex) {
            System.out.print("IO ");
            System.out.print(ex.getMessage());
        } catch (Exception ex) {
            System.out.print("Other ");
            System.out.print(ex.getSuppressed()[0].getMessage());
        }
        System.out.print("the end ");
    }
}
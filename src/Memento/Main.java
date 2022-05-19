package Memento;

public class Main {
    public static void main(String[] args) {
        File file = new File("content", 1, "directorul D", "Proba");

        System.out.println(file);
        file.setContent("content2");
        FileSnapshot fileSnapshot = file.createfileSnapshot();
        System.out.println(fileSnapshot.getDetails());
        VersionControl versionControl = new VersionControl();
        versionControl.addFileSnapsot(fileSnapshot);
        FileSnapshot fileSnapshot1 = file.createfileSnapshot();
        System.out.println(file.print());
        System.out.println(fileSnapshot1.getDetails());
        versionControl.addFileSnapsot(fileSnapshot1);
        file.restoreToSomePoint(fileSnapshot);
        System.out.println(file.print());
        versionControl.listSnapshot();


    }
}

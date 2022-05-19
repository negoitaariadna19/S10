package Memento;

import java.util.HashMap;

public class VersionControl {
    private HashMap<Integer, FileSnapshot> versions=new HashMap<>();
    public static int version;

public void addFileSnapsot(FileSnapshot fileSnapshot)
{
versions.put(version,fileSnapshot);
    System.out.println("S-a adaugat FileSnapshot");
}
public int getFSByVersion()
{

    return versions.get(version).version;
}

public void listSnapshot()
{
    for(int version : versions.keySet()){
        System.out.println(version);
    }
    for(FileSnapshot fileSnapshot : versions.values()){
        fileSnapshot.getDetails();
    }
}

public static int getNewVersion()
{

    return version++;
}


}

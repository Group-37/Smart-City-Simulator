/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileReadWrite;

import java.lang.reflect.Constructor;
import java.util.HashMap;

/**
 *
 * @author Neil
 */
public class IFileFactory {
    private static HashMap<String, IFile> iFiles = new HashMap<String, IFile>();
    
    public static void addIFile(String nameID, IFile iFile)
    {
        iFiles.put(nameID, iFile);
    }
    
    public static IFile getIFile(String nameID)
    {
        IFile IFileClass = (IFile)iFiles.get(nameID);
        return IFileClass;
    }
}

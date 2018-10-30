/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileReadWrite;

/**
 *
 * @author Neil
 */
public interface IFile {
    String [][] read();
    void write(String [][] write);
    void get(String filepath);
    void put(String filepath);
    void append(boolean canAppend);
    String getDelimiter();
}

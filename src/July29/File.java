package July29;

public class File {
    public static void main(String[] args) {
        ReadOnlyFile readOnlyFile=new ReadOnlyFile("Any one can read");
        System.out.println(readOnlyFile.getReadonly());
        WriteOnlyFile writeOnlyFile=new WriteOnlyFile("Any one can write");
        writeOnlyFile.setWriteOnly("File updated");
        ReadandWriteFile readandWriteFile=new ReadandWriteFile();
        System.out.println(readandWriteFile.getReadandwrite());
        readandWriteFile.setReadandwrite("Read and write file updated");
        System.out.println(readandWriteFile.getReadandwrite());

    }
}

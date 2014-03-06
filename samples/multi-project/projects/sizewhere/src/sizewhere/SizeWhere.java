package sizewhere;

import version.Version;
import size.FileSize;
import find.FindFile;

import java.io.File;

public final class SizeWhere {
    static {
	Version.register("sizewhere");
    }
  
    public static long totalSize(File dir, String name) {
	return FileSize.totalSize(FindFile.find(dir, name));
    }
  
    private SizeWhere() {
    }
}

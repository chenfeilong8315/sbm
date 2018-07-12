package com.importdata.common;

import java.io.File;
import java.util.List;

public interface IRead {
	public void importAndBackup(long start, List<String> filePaths,
			File afile);
}

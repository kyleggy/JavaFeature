package com.scott.java.unittest.mocknewfile;

import org.easymock.Mock;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.api.mockito.PowerMockito;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lizhaok on 2016/8/26.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({FileAdapter.class})
public class FileAdapterTest {

    FileAdapter fileAdapter;
    File file;

    //Sample to mock private new object
    @Test
    public void testIsFileExist() throws Exception {
        file = PowerMockito.mock(File.class);
        PowerMockito.when(file.exists()).thenReturn(true);
        PowerMockito.whenNew(File.class).withAnyArguments().thenReturn(file);
        fileAdapter = new FileAdapter();
        Assert.assertEquals(fileAdapter.isFileExist(), true);
    }

    @Test
    public void testArrayList() {
        List<String> aList = new ArrayList<>();
        aList.add("a");
        aList.add("b");

        List<String> bList = new ArrayList<>();
        bList.add("b");
        bList.add("a");

        Assert.assertEquals(aList.equals(bList), true);
    }


}

package org.asdtm.goodweather;

import com.robotium.solo.Solo;
import android.test.ActivityInstrumentationTestCase2;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by zx on 2018/3/29.
 */

public class TestGraphsOne extends ActivityInstrumentationTestCase2<MainActivity>{
    private Solo solo;

    public TestGraphsOne(){
        super(MainActivity.class);
    }

    @Before
    public void setUp() throws Exception {
        super.setUp();
        solo = new Solo(getInstrumentation(),getActivity());

    }


    @After
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
        super.tearDown();
    }

    @Test
    public void testGraphsOne() throws Exception{

        solo.unlockScreen();
        solo.takeScreenshot("beforeTestGraphsOne");
        solo.clickOnImageButton(0);
        solo.clickInRecyclerView(2);

        boolean textFound = solo.searchText("Temperature");
        assertTrue(textFound);
        solo.takeScreenshot("afterTestGraphOne");


    }

}

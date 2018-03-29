package org.asdtm.goodweather;

import com.robotium.solo.Solo;
import android.test.ActivityInstrumentationTestCase2;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by zx on 2018/3/29.
 */

public class TestDailyForecastOne extends ActivityInstrumentationTestCase2<MainActivity>{

    private Solo solo;

    public TestDailyForecastOne(){
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
    public void testDailyForecastOne() throws Exception{

        solo.unlockScreen();
        solo.takeScreenshot("BeforeTestDailyForecastOne");
        solo.clickOnImageButton(0);
        solo.clickInRecyclerView(3);
        boolean textFound = solo.searchText("Mon") | solo.searchText("Tue") | solo.searchText("Wed") | solo.searchText("Thu");
        assertTrue(textFound);
        solo.takeScreenshot("AfterTestDailyForecastOne");
    }

}

package org.asdtm.goodweather;

import com.robotium.solo.Solo;
import android.test.ActivityInstrumentationTestCase2;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by zx on 2018/3/29.
 */

public class TestSettingTemperatureUnit extends ActivityInstrumentationTestCase2<MainActivity> {
    private Solo solo;

    public TestSettingTemperatureUnit(){
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
    public void testSettingTemperatureUnitToF() throws Exception{
        solo.unlockScreen();
        solo.clickOnImageButton(0);
        solo.clickInRecyclerView(5);
        solo.clickInList(1);
        solo.clickInList(1);

        solo.sleep(500);
        solo.takeScreenshot("BeforeTestSettingTemperatureUnitToF");
        solo.clickInList(2,0);
        solo.goBack();
        solo.goBack();
        solo.sleep(500);
        solo.takeScreenshot("AfterTestSettingTemperatureUnitToF");
    }

    @Test
    public void testSettingTemperatureUnitToC() throws Exception{
        solo.unlockScreen();
        solo.clickOnImageButton(0);
        solo.clickInRecyclerView(5);
        solo.clickInList(1);
        solo.clickInList(1);

        solo.sleep(500);
        solo.takeScreenshot("BeforeTestSettingTemperatureUnitToC");
        solo.clickInList(1,0);
        solo.goBack();
        solo.goBack();
        solo.sleep(500);
        solo.takeScreenshot("AfterTestSettingTemperatureUnitToC");
    }
}

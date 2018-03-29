package org.asdtm.goodweather;

import com.robotium.solo.Solo;
import android.test.ActivityInstrumentationTestCase2;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.nio.channels.Pipe;

/**
 * Created by zx on 2018/3/29.
 */

public class TestSettingTheme extends ActivityInstrumentationTestCase2<MainActivity>{
    private Solo solo;

    public TestSettingTheme(){
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
    public void testSettingThemeToLight() throws Exception{
        solo.unlockScreen();
        solo.clickOnImageButton(0);
        solo.clickInRecyclerView(5);
        solo.clickInList(1);
        solo.clickInList(5);

        solo.sleep(500);
        solo.takeScreenshot("BeforeTestSettingThemeToLight");

        solo.clickInList(1,0);
        solo.goBack();
        solo.goBack();

        solo.sleep(500);
        solo.takeScreenshot("AfterTestSettingThemeToLight");
    }

    @Test
    public void testSettingThemeToDark() throws Exception{
        solo.unlockScreen();
        solo.clickOnImageButton(0);
        solo.clickInRecyclerView(5);
        solo.clickInList(1);
        solo.clickInList(5);

        solo.sleep(500);
        solo.takeScreenshot("BeforeTestSettingThemeToDark");

        solo.clickInList(2,0);
        solo.goBack();
        solo.goBack();

        solo.sleep(500);
        solo.takeScreenshot("AfterTestSettingThemeToDark");
    }


}

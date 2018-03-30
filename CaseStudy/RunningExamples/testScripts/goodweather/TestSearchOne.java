package org.asdtm.goodweather;


import com.robotium.solo.Solo;
import android.test.ActivityInstrumentationTestCase2;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by zx on 2018/3/30.
 */

public class TestSearchOne extends ActivityInstrumentationTestCase2<MainActivity>{
    private Solo solo;

    public TestSearchOne(){
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
    public void testSearchOne() throws Exception{
        solo.unlockScreen();
        solo.takeScreenshot("BeforeTestSearchOne");
        solo.clickOnView(solo.getView(R.id.main_menu_search_city));
        solo.enterText(0,"Nanjing");
        solo.sleep(500);
        solo.clickInRecyclerView(0);
        boolean textFound = solo.searchText("Nanjing");
        assertTrue(textFound);
        solo.takeScreenshot("AfterTestSearchOne");
    }
}

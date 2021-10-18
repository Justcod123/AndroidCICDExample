package com.example.androidcicdexample

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.filters.SmallTest
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Created by Abhin.
 */
@SmallTest
@RunWith(AndroidJUnit4ClassRunner::class)
class LoginSuccessTest {

    @Before
    fun start() {
        ActivityScenario.launch(DashBoardActivity::class.java)
        Thread.sleep(500)
    }

    @Test
    fun loginTest() {

        Espresso.onView(ViewMatchers.withId(R.id.txt_login_success_dash_board_activity))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        Espresso.onView(ViewMatchers.withId(R.id.txt_login_success_dash_board_activity)).perform(ViewActions.typeText("SUCCESS "))

        Thread.sleep(1000)
    }
}
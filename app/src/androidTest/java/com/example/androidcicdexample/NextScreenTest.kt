package com.example.androidcicdexample

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Created by Abhin.
 */

@RunWith(AndroidJUnit4::class)
class NextScreenTest {

    @Before
    fun start() {
        ActivityScenario.launch(MainActivity::class.java)
        Thread.sleep(500)
    }

    @Test
    fun nextScreenTest() {
        Espresso.onView(ViewMatchers.withId(R.id.btn_next_screen_activity))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed())).perform(
                click()
            )
        Thread.sleep(1000)
    }
}
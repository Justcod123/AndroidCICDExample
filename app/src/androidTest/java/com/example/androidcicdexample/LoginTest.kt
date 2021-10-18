package com.example.androidcicdexample

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.SmallTest
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Created by Abhin.
 */

@RunWith(AndroidJUnit4::class)
class LoginTest {

    @Before
    fun start() {
        ActivityScenario.launch(MainActivity::class.java)
        Thread.sleep(500)
    }

    @Test
    fun loginTest() {

        Espresso.onView(ViewMatchers.withId(R.id.edt_email_main_activity))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed())).perform(
                ViewActions.typeText("test@gmail.com"),
                ViewActions.closeSoftKeyboard()
            )

        Espresso.onView(ViewMatchers.withId(R.id.edt_password_main_activity))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed())).perform(
                ViewActions.typeText("test@123"),
                ViewActions.closeSoftKeyboard()
            )

        Espresso.onView(ViewMatchers.withId(R.id.btn_login_main_activity))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed())).perform(
                click()
            )
        Thread.sleep(1000)
    }
}
package com.example.androidcicdexample

import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.UiController
import androidx.test.espresso.ViewAction
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.SmallTest
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.hamcrest.Matcher
import org.hamcrest.core.AllOf
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Created by Abhin.
 */

@RunWith(AndroidJUnit4::class)
class LoginSuccessTest {

    @Before
    fun start() {
        ActivityScenario.launch(DashBoardActivity::class.java)
        Thread.sleep(500)
    }

    @Test
    fun successTest() {

        Espresso.onView(ViewMatchers.withId(R.id.txt_login_success_dash_board_activity))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        Espresso.onView(ViewMatchers.withId(R.id.txt_login_success_dash_board_activity)).perform(upDateText("SUCCESS"))

        Thread.sleep(1000)
    }

    private fun upDateText(startValue: String): ViewAction {
        return object : ViewAction {
            override fun getConstraints(): Matcher<View> {
                return AllOf.allOf(
                    ViewMatchers.isDisplayed(),
                    ViewMatchers.isAssignableFrom(AppCompatTextView::class.java)
                )
            }

            override fun getDescription(): String {
                return "replace text"
            }

            override fun perform(uiController: UiController?, view: View) {
                (view as AppCompatTextView).text = startValue
            }
        }
    }
}
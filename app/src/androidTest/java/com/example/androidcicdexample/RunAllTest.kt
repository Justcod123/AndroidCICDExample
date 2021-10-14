package com.example.androidcicdexample

import org.junit.runner.RunWith
import org.junit.runners.Suite

/**
 * Created by Abhin.
 */
@RunWith(Suite::class)
@Suite.SuiteClasses(LoginTest::class, LoginSuccessTest::class)
class RunAllTest
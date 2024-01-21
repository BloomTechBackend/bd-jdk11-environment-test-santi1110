# JDK 11 Environment Test


## Git Clone Fail?
If your Git Clone failed, fear not. Click the Green "Code" button on GitHub for this project and choose "Download Zip". Unzip the folder to your computer and then open the project with IntelliJ. You will have additional lessons coming up which will hopefully fix any Git problems.

## Testing your 11 JDK


This project will check to see if your JDK 11 setup has been successful.

When opening a project for the first time in IntelliJ it will do several setup and downloads in the background. Wait for these to finish. If you see nothing occurring on the bottom-right part of the window IntelliJ is ready.

Follow the steps outlined below:

### 1) Run the Main.java on IntelliJ
Open the Main.java file. The easiest way to do this is to type the ```shift``` key twice on your keyboard, then type in ```Main``` and hit enter.

You will see a Green Arrow on the gutters on line #3 and line #9. Click either of these and select ```Run 'Main.main()'```

A successful run will look something like this:
```
5:01:19 PM: Executing ':Main.main()'...

> Task :compileJava
> Task :processResources NO-SOURCE
> Task :classes

> Task :Main.main()
accountA = Account{name='Ada Lovelace', id=0}
accountB = Account{name='Grace Hopper', id=1}
accountA = Account{name='Augusta Ada King', id=0}

*********************************************************
You will verify this project ran correctly in the
"Environment Setup: Check for understanding" task.

If you are prompted in that task for the key,
the JDK11 Environment Setup key is:  ####
*********************************************************

BUILD SUCCESSFUL in 330ms
2 actionable tasks: 2 executed
5:01:20 PM: Execution finished ':Main.main()'.
```

The key displayed here will not be a #### for you. You may be asked for this key in the task named Environment Setup: Check for Understanding. You can always re-run this program to see the key again or you may write it down now.

### 2) Run the AccountTest.java on IntelliJ
Open the AccountTest.java file. The easiest way to do this is to type the shift key twice on your keyboard, then type in AccountTest and hit enter.

You will see a Green Arrow on the gutter on line #7, #10, #19, and #30. Click the arrows on line #7 select Run 'AccountTest'.  

A successful run will look something like this:
```
> Task :compileJava UP-TO-DATE
> Task :processResources NO-SOURCE
> Task :classes UP-TO-DATE
> Task :compileTestJava UP-TO-DATE
> Task :processTestResources NO-SOURCE
> Task :testClasses UP-TO-DATE
> Task :test
main.com.AccountTest
  Test testAccountSetNameCorrectlyUpdates() PASSED
  Test testAccountIDUniqueWithSameNameAccounts() PASSED
  Test testAccountNameStoredFromConstructor() PASSED
SUCCESS: Executed 3 tests in 933ms
--------------------------------------------------------------------
|  Results: SUCCESS (3 tests, 3 successes, 0 failures, 0 skipped)  |
--------------------------------------------------------------------
Exit Result for Scoring: 1.00
BUILD SUCCESSFUL in 1s
```

### 3) Run the tests on your command line interface
Open the directory this project is located on your computer in the command line interface of your choice (Terminal for Mac, GitBash on Windows).

If you are unfamiliar with navigating to your directory, find this directory on your Explorer or Finder, right-click the directory called bd-jdk11-environment-test, and select: 
```New Terminal at Folder``` for MacOs or ```Git Bash Here``` for Windows.

Type or copy/paste the following into your command line:
```
./gradlew -q clean :test
```

A successful run will look something like this:
``` 
main.com.AccountTest

  Test testAccountSetNameCorrectlyUpdates() PASSED
  Test testAccountIDUniqueWithSameNameAccounts() PASSED
  Test testAccountNameStoredFromConstructor() PASSED

SUCCESS: Executed 3 tests in 833ms


--------------------------------------------------------------------
|  Results: SUCCESS (3 tests, 3 successes, 0 failures, 0 skipped)  |
--------------------------------------------------------------------
Exit Result for Scoring: 1.00

```

### 4) Run the Checkstyle tests on your command line interface
Open the directory this project is located on your computer in the command line interface of your choice with the same steps as above.

Type or copy/paste the following into your command line:
```
./gradlew checkstyleMain 
```


A successful run will look something like this:
``` 
BUILD SUCCESSFUL in 489ms
2 actionable tasks: 2 up-to-date
```


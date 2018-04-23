# Exam_Varun

In order to run this project,

you need to run the following maven command

mvn clean install -U test -Dgroups=full -Dpath=dictionary.txt

RESULTS:

<html xmlns="http://www.w3.org/1999/xhtml"><head><title>TestNG Report</title><style type="text/css">table {margin-bottom:10px;border-collapse:collapse;empty-cells:show}th,td {border:1px solid #009;padding:.25em .5em}th {vertical-align:bottom}td {vertical-align:top}table a {font-weight:bold}.stripe td {background-color: #E6EBF9}.num {text-align:right}.passedodd td {background-color: #3F3}.passedeven td {background-color: #0A0}.skippedodd td {background-color: #DDD}.skippedeven td {background-color: #CCC}.failedodd td,.attn {background-color: #F33}.failedeven td,.stripe .attn {background-color: #D00}.stacktrace {white-space:pre;font-family:monospace}.totop {font-size:85%;text-align:center;border-bottom:2px solid #000}</style></head><body><table><tr><th>Test</th><th># Passed</th><th># Skipped</th><th># Failed</th><th>Time (ms)</th><th>Included Groups</th><th>Excluded Groups</th></tr><tr><th colspan="7">Suite</th></tr><tr><td><a href="#t0">Test</a></td><td class="num">3</td><td class="num">0</td><td class="num">0</td><td class="num">9,676</td><td>One, Two, Three, full</td><td></td></tr></table><table><thead><tr><th>Class</th><th>Method</th><th>Start</th><th>Time (ms)</th></tr></thead><tbody><tr><th colspan="4">Suite</th></tr></tbody><tbody id="t0"><tr><th colspan="4">Test &#8212; passed</th></tr><tr class="passedeven"><td rowspan="1">test.java.com.varun.tests.QuestionOne</td><td><a href="#m0">testQuestionOne</a></td><td rowspan="1">1524376323816</td><td rowspan="1">11</td></tr><tr class="passedodd"><td rowspan="1">test.java.com.varun.tests.QuestionThree</td><td><a href="#m1">testPrintSmallestRandomNumber</a></td><td rowspan="1">1524376323829</td><td rowspan="1">5</td></tr><tr class="passedeven"><td rowspan="1">test.java.com.varun.tests.QuestionTwo</td><td><a href="#m2">testSecondQuestion</a></td><td rowspan="1">1524376329084</td><td rowspan="1">4243</td></tr></tbody></table><h2>Test</h2><h3 id="m0">test.java.com.varun.tests.QuestionOne#testQuestionOne</h3><table class="result"><tr class="param"><th>Parameter #1</th></tr><tr class="param stripe"><td>dictionary.txt</td></tr><tr><th>Messages</th></tr><tr><td><div class="messages">>>>>>/Users/ecortes/git/Exam_Varun/src/test/java/com/varun/tests/dictionary.txt<br/>Apple <br/> a fruit<br/> a tech firm<br/>Table <br/> an object<br/> contains rows and columns when used in context of computers<br/>Orange <br/> a fruit</div></td></tr></table><p class="totop"><a href="#summary">back to summary</a></p><h3 id="m1">test.java.com.varun.tests.QuestionThree#testPrintSmallestRandomNumber</h3><table class="result"><tr><th>Messages</th></tr><tr><td><div class="messages">Generate 500 random numbers and print the nth smallest number<br/><br>This is the smallest number of the random generated numbers: <br>25</div></td></tr></table><p class="totop"><a href="#summary">back to summary</a></p><h3 id="m2">test.java.com.varun.tests.QuestionTwo#testSecondQuestion</h3><table class="result"><tr><th>Messages</th></tr><tr><td><div class="messages"><br>2.- Verify loaded page title matches Weight Loss Program, Recipes & Help | Weight Watchers<br/><br>3.- On the right corner of the page, click on Find a Meeting<br/><br>4.- Verify loaded page title contains Get Schedules & Times Near You<br/><br>5.- In the search field, search for meetings for zip code: 10011<br/><br>6.- Print the title of the first result and the distance (located on the right of location title/name)<br/>>>TITLE> WEIGHT WATCHERS STORE 23RD ST-5TH AVE<br/>>>DISTANCE> 0.49 mi.<br/><br>7.- Click on the first search result and then, verify displayed location name matches with the name of the first searched result that was clicked.<br/>>>TITLE> WEIGHT WATCHERS STORE 23RD ST-5TH AVE<br/>>>>Clicking on the First Result<br/>>>TITLE> WEIGHT WATCHERS STORE 23RD ST-5TH AVE<br/>>>>> Name of the Result Displayed in the loaded Page: WEIGHT WATCHERS STORE 23RD ST-5TH AVE<br/>>>TITLE> WEIGHT WATCHERS STORE 23RD ST-5TH AVE<br/>>>>> Name of the First Title that we clicked on: WEIGHT WATCHERS STORE 23RD ST-5TH AVE<br/><br>8.- From this location page, print TODAY's hours of operation (located towards the bottom of the page)<br/>>Getting Hours of Operation<br/><br>Sunday
10:00 AM  -  1:00 PM
Monday
7:45 AM  -  9:15 AM
12:00 PM  -  2:00 PM
5:30 PM  -  7:00 PM
Tuesday
8:00 AM  -  2:00 PM
4:45 PM  -  8:00 PM
Wednesday
9:30 AM  -  2:00 PM
5:00 PM  -  8:00 PM
Thursday
7:45 AM  -  10:30 AM
11:45 AM  -  2:00 PM
4:45 PM  -  8:00 PM
Friday
7:45 AM  -  9:30 AM
11:45 AM  -  2:00 PM
2:30 PM  -  4:30 PM
Saturday
8:00 AM  -  1:00 PM<br><br/>Finishing Test !</div></td></tr></table><p class="totop"></p></body></html>

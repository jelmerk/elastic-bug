Elastic bug 
===========

To reproduce the behaviour of [issue 22689](https://github.com/elastic/elasticsearch/issues/22689)

Run mvn clean install and it will output


	java.security.AccessControlException: access denied ("java.lang.RuntimePermission" "accessDeclaredMembers")

		at java.security.AccessControlContext.checkPermission(AccessControlContext.java:472)
		at java.security.AccessController.checkPermission(AccessController.java:884)
		at java.lang.SecurityManager.checkPermission(SecurityManager.java:549)
		at java.lang.Class.checkMemberAccess(Class.java:2348)
		at java.lang.Class.getDeclaredMethods(Class.java:1974)
		at org.junit.internal.MethodSorter.getDeclaredMethods(MethodSorter.java:54)
		at org.junit.runners.model.TestClass.scanAnnotatedMembers(TestClass.java:65)
		at org.junit.runners.model.TestClass.<init>(TestClass.java:57)
		at com.carrotsearch.randomizedtesting.RandomizedRunner$12.run(RandomizedRunner.java:1053)
		at com.carrotsearch.randomizedtesting.RandomizedRunner$12.run(RandomizedRunner.java:1050)
		at java.security.AccessController.doPrivileged(Native Method)
		at com.carrotsearch.randomizedtesting.RandomizedRunner.getAnnotatedFieldValues(RandomizedRunner.java:1050)
		at com.carrotsearch.randomizedtesting.RandomizedRunner.withClassRules(RandomizedRunner.java:885)
		at com.carrotsearch.randomizedtesting.RandomizedRunner.runSuite(RandomizedRunner.java:674)
		at com.carrotsearch.randomizedtesting.RandomizedRunner.access$200(RandomizedRunner.java:140)
		at com.carrotsearch.randomizedtesting.RandomizedRunner$2.run(RandomizedRunner.java:598)


	Test ignored.REPRODUCE WITH: gradle null -Dtests.seed=C46AFEACC68DE328 -Dtests.class=nl.marktplaats.elastic.MyTest -Dtests.locale=en-US -Dtests.timezone=Europe/Amsterdam
	NOTE: Mac OS X 10.11.6 x86_64/Oracle Corporation 1.8.0_72 (64-bit)/cpus=8,threads=1,free=208252840,total=257425408
	NOTE: All tests run in this JVM: [MyTest]


	
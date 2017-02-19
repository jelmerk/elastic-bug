package nl.marktplaats.elastic;

public class NeedsToBeHere {

    /*

    There needs to be a class here  or you get the following error


nl.marktplaats.elastic.MyTest  Time elapsed: 0.684 sec  <<< ERROR!
java.lang.RuntimeException: found jar hell in test classpath
	at org.elasticsearch.bootstrap.BootstrapForTesting.<clinit>(BootstrapForTesting.java:90)
	at org.elasticsearch.test.ESTestCase.<clinit>(ESTestCase.java:168)
	at java.lang.Class.forName0(Native Method)
	at java.lang.Class.forName(Class.java:348)
	at com.carrotsearch.randomizedtesting.RandomizedRunner$2.run(RandomizedRunner.java:592)
Caused by: java.nio.file.NoSuchFileException: /Users/jkuperus/bug-minimal/target/classes

     */
}

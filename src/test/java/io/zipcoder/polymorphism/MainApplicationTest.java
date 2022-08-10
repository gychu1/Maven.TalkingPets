package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class MainApplicationTest {

    @Test
    public void speakTestDog() {
        //given, when, then
        Dog dog = new Dog("Doggo");

        String actual = dog.speak();
        String expected = "woof";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTestCat() {
        Cat cat = new Cat("Catto");

        String actual = cat.speak();
        String expected = "meow";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTestBunny() {
        Bunny bunny = new Bunny("Bunno");

        String actual = bunny.speak();
        String expected = "nim nim nim";

        Assert.assertEquals(expected, actual);
    }
}

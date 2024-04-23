package org.uzum.iggytoto.javacore_collections.homework3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Random;

class Homework31Test {

    private static String TEXT = "— Она несла в руках отвратительные, тревожные желтые цветы. Черт их знает, как их зовут, но они первые почему-то появляются в Москве. И эти цветы очень отчетливо выделялись на черном ее весеннем пальто. Она несла желтые цветы! Нехороший цвет. Она повернула с Тверской в переулок и тут обернулась. Ну, Тверскую вы знаете? По Тверской шли тысячи людей, но я вам ручаюсь, что увидела она меня одного и поглядела не то что тревожно, а даже как будто болезненно. И меня поразила не столько ее красота, сколько необыкновенное, никем не виданное одиночество в глазах!\n" +
            "Повинуясь этому желтому знаку, я тоже свернул в переулок и пошел по ее следам. Мы шли по кривому, скучному переулку безмолвно, я по одной стороне, а она по другой. И не было, вообразите, в переулке ни души. Я мучился, потому что мне показалось, что с нею необходимо говорить, и тревожился, что я не вымолвлю ни одного слова, а она уйдет, и я никогда ее более не увижу.\n" +
            "И, вообразите, внезапно заговорила она:\n" +
            "— Нравятся ли вам мои цветы?Я отчетливо помню, как прозвучал ее голос, низкий довольно-таки, но со срывами, и, как это ни глупо, показалось, что эхо ударило в переулок и отразилось от желтой грязной стены. \n" +
            "Я быстро перешел на ее сторону и, подходя к ней, ответил:\n" +
            "— Нет.\n" +
            "Она поглядела на меня удивленно, а я вдруг, и совершенно неожиданно, понял, что я всю жизнь любил именно эту женщину! Вот так штука, а? Вы, конечно, скажете, сумасшедший?\n" +
            "— Ничего я не говорю, — воскликнул Иван и добавил: — Умоляю, дальше!\n" +
            "И гость продолжал:\n" +
            "— Да, она поглядела на меня удивленно, а затем, поглядев, спросила так:\n" +
            "— Вы вообще не любите цветов?\n" +
            "В голосе ее была, как мне показалось, враждебность. Я шел с нею рядом, стараясь идти в ногу, и, к удивлению моему, совершенно не чувствовал себя стесненным.\n" +
            "— Нет, я люблю цветы, только не такие, — сказал я.\n" +
            "— А какие?\n" +
            "— Я розы люблю.\n" +
            "Тут я пожалел о том, что это сказал, потому что она виновато улыбнулась и бросила свои цветы в канаву. Растерявшись немного, я все-таки поднял их и подал ей, но она, усмехнувшись, оттолкнула цветы, и я понес их в руках.Так шли молча некоторое время, пока она не вынула у меня из рук цветы, не бросила их на мостовую, затем продела свою руку в черной перчатке с раструбом в мою, и мы пошли рядом.\n" +
            "— Дальше, — сказал Иван, — и не пропускайте, пожалуйста, ничего.\n" +
            "— Дальше? — переспросил гость. — Что же, дальше вы могли бы и сами угадать. — Он вдруг вытер неожиданную слезу правым рукавом и продолжал: — Любовь выскочила перед нами, как из-под земли выскакивает убийца в переулке, и поразила нас сразу обоих! Так поражает молния, так поражает финский нож! Она-то, впрочем, утверждала впоследствии, что это не так, что любили мы, конечно, друг друга давным-давно, не зная друг друга, никогда не видя, и что она жила с другим человеком... и я там, тогда... с этой, как ее...\n" +
            "— С кем? — спросил Бездомный.\n" +
            "— С этой... ну... с этой... ну... — ответил гость и защелкал пальцами.\n" +
            "— Вы были женаты?\n" +
            "— Ну да, вот же я и щелкаю... На этой... Вареньке... Манечке... нет, Вареньке... еще платье полосатое... музей... Впрочем, я не помню.Так вот она говорила, что с желтыми цветами в руках она вышла в тот день, чтобы я наконец ее нашел, и что, если бы этого не произошло, она отравилась бы, потому что жизнь ее пуста.Да, любовь поразила нас мгновенно. Я это знал в тот же день, уже через час, когда мы оказались, не замечая города, у Кремлевской стены на набережной. Мы разговаривали так, как будто расстались вчера, как будто знали друг друга много лет. На другой день мы сговорились встретиться там же, на Москве-реке, и встретились. Майское солнце светило нам. И скоро, скоро стала эта женщина моею тайною женой.";


    @Test
    public void hw3Test() {
        var o = new Homework3_1();

        var result = o.countWords(TEXT);

        Assertions.assertEquals(result.get("замечая"), 1);
        Assertions.assertEquals(result.get("канаву"), 1);
        Assertions.assertEquals(result.get("тоже"), 1);
        Assertions.assertEquals(result.get("добавил"), 1);
        Assertions.assertEquals(result.get("свернул"), 1);
        Assertions.assertEquals(result.get("день"), 3);
        Assertions.assertEquals(result.get("этому"), 1);
        Assertions.assertEquals(result.get("реке"), 1);
        Assertions.assertEquals(result.get("желтыми"), 1);
        Assertions.assertEquals(result.get("еще"), 1);
        Assertions.assertEquals(result.get("таки"), 2);
        Assertions.assertEquals(result.get("моему"), 1);
        Assertions.assertEquals(result.get("поражает"), 2);
        Assertions.assertEquals(result.get("этой"), 4);
        Assertions.assertEquals(result.get("вдруг"), 2);
        Assertions.assertEquals(result.get("выскакивает"), 1);
        Assertions.assertEquals(result.get("финский"), 1);
        Assertions.assertEquals(result.get("со"), 1);
        Assertions.assertEquals(result.get("пуста"), 1);
        Assertions.assertEquals(result.get("перчатке"), 1);
        Assertions.assertEquals(result.get("тайною"), 1);
        Assertions.assertEquals(result.get("цветов"), 1);
        Assertions.assertEquals(result.get("под"), 1);
        Assertions.assertEquals(result.get("друг"), 3);
        Assertions.assertEquals(result.get("людей"), 1);
        Assertions.assertEquals(result.get("необыкновенное"), 1);
        Assertions.assertEquals(result.get("молча"), 1);
        Assertions.assertEquals(result.get("ногу"), 1);
        Assertions.assertEquals(result.get("чувствовал"), 1);
        Assertions.assertEquals(result.get("полосатое"), 1);
        Assertions.assertEquals(result.get("знаете"), 1);
        Assertions.assertEquals(result.get("а"), 7);
        Assertions.assertEquals(result.get("тут"), 2);
        Assertions.assertEquals(result.get("вообще"), 1);
        Assertions.assertEquals(result.get("в"), 17);
        Assertions.assertEquals(result.get("срывами"), 1);
        Assertions.assertEquals(result.get("сами"), 1);
        Assertions.assertEquals(result.get("немного"), 1);
        Assertions.assertEquals(result.get("стала"), 1);
        Assertions.assertEquals(result.get("и"), 31);
        Assertions.assertEquals(result.get("лет"), 1);
        Assertions.assertEquals(result.get("внезапно"), 1);
        Assertions.assertEquals(result.get("к"), 2);
        Assertions.assertEquals(result.get("бы"), 3);
        Assertions.assertEquals(result.get("то"), 3);
        Assertions.assertEquals(result.get("любите"), 1);
        Assertions.assertEquals(result.get("такие"), 1);
        Assertions.assertEquals(result.get("о"), 1);
        Assertions.assertEquals(result.get("сказал"), 3);
        Assertions.assertEquals(result.get("некоторое"), 1);
        Assertions.assertEquals(result.get("она"), 17);
        Assertions.assertEquals(result.get("с"), 10);
        Assertions.assertEquals(result.get("давным"), 1);
        Assertions.assertEquals(result.get("у"), 2);
        Assertions.assertEquals(result.get("неожиданную"), 1);
        Assertions.assertEquals(result.get("души"), 1);
        Assertions.assertEquals(result.get("какие"), 1);
        Assertions.assertEquals(result.get("моею"), 1);
        Assertions.assertEquals(result.get("они"), 1);
        Assertions.assertEquals(result.get("заговорила"), 1);
        Assertions.assertEquals(result.get("растерявшись"), 1);
        Assertions.assertEquals(result.get("женщина"), 1);
        Assertions.assertEquals(result.get("я"), 23);
        Assertions.assertEquals(result.get("увижу"), 1);
        Assertions.assertEquals(result.get("отразилось"), 1);
        Assertions.assertEquals(result.get("уже"), 1);
        Assertions.assertEquals(result.get("скажете"), 1);
        Assertions.assertEquals(result.get("пропускайте"), 1);
        Assertions.assertEquals(result.get("вытер"), 1);
        Assertions.assertEquals(result.get("раструбом"), 1);
        Assertions.assertEquals(result.get("цвет"), 1);
        Assertions.assertEquals(result.get("вы"), 5);
        Assertions.assertEquals(result.get("пожалуйста"), 1);
        Assertions.assertEquals(result.get("женщину"), 1);
        Assertions.assertEquals(result.get("свою"), 1);
        Assertions.assertEquals(result.get("необходимо"), 1);
        Assertions.assertEquals(result.get("вынула"), 1);
        Assertions.assertEquals(result.get("давно"), 1);
        Assertions.assertEquals(result.get("быстро"), 1);
        Assertions.assertEquals(result.get("время"), 1);
        Assertions.assertEquals(result.get("слезу"), 1);
        Assertions.assertEquals(result.get("желтой"), 1);
        Assertions.assertEquals(result.get("жила"), 1);
        Assertions.assertEquals(result.get("повинуясь"), 1);
        Assertions.assertEquals(result.get("говорю"), 1);
        Assertions.assertEquals(result.get("кем"), 1);
        Assertions.assertEquals(result.get("расстались"), 1);
        Assertions.assertEquals(result.get("болезненно"), 1);
        Assertions.assertEquals(result.get("свои"), 1);
        Assertions.assertEquals(result.get("тревожные"), 1);
        Assertions.assertEquals(result.get("убийца"), 1);
        Assertions.assertEquals(result.get("встретиться"), 1);
        Assertions.assertEquals(result.get("чтобы"), 1);
        Assertions.assertEquals(result.get("да"), 3);
        Assertions.assertEquals(result.get("продела"), 1);
        Assertions.assertEquals(result.get("пальцами"), 1);
        Assertions.assertEquals(result.get("выскочила"), 1);
        Assertions.assertEquals(result.get("говорила"), 1);
        Assertions.assertEquals(result.get("зная"), 1);
        Assertions.assertEquals(result.get("произошло"), 1);
        Assertions.assertEquals(result.get("одной"), 1);
        Assertions.assertEquals(result.get("перед"), 1);
        Assertions.assertEquals(result.get("весеннем"), 1);
        Assertions.assertEquals(result.get("рук"), 1);
        Assertions.assertEquals(result.get("обоих"), 1);
        Assertions.assertEquals(result.get("час"), 1);
        Assertions.assertEquals(result.get("правым"), 1);
        Assertions.assertEquals(result.get("знал"), 1);
        Assertions.assertEquals(result.get("розы"), 1);
        Assertions.assertEquals(result.get("показалось"), 3);
        Assertions.assertEquals(result.get("виданное"), 1);
        Assertions.assertEquals(result.get("нехороший"), 1);
        Assertions.assertEquals(result.get("другой"), 2);
        Assertions.assertEquals(result.get("женаты"), 1);
        Assertions.assertEquals(result.get("наконец"), 1);
        Assertions.assertEquals(result.get("видя"), 1);
        Assertions.assertEquals(result.get("спросила"), 1);
        Assertions.assertEquals(result.get("кривому"), 1);
        Assertions.assertEquals(result.get("ее"), 10);
        Assertions.assertEquals(result.get("впоследствии"), 1);
        Assertions.assertEquals(result.get("ей"), 1);
        Assertions.assertEquals(result.get("нож"), 1);
        Assertions.assertEquals(result.get("утверждала"), 1);
        Assertions.assertEquals(result.get("зовут"), 1);
        Assertions.assertEquals(result.get("подходя"), 1);
        Assertions.assertEquals(result.get("улыбнулась"), 1);
        Assertions.assertEquals(result.get("пока"), 1);
        Assertions.assertEquals(result.get("себя"), 1);
        Assertions.assertEquals(result.get("платье"), 1);
        Assertions.assertEquals(result.get("появляются"), 1);
        Assertions.assertEquals(result.get("обернулась"), 1);
        Assertions.assertEquals(result.get("пошли"), 1);
        Assertions.assertEquals(result.get("тверской"), 2);
        Assertions.assertEquals(result.get("неожиданно"), 1);
        Assertions.assertEquals(result.get("люблю"), 2);
        Assertions.assertEquals(result.get("мостовую"), 1);
        Assertions.assertEquals(result.get("сколько"), 1);
        Assertions.assertEquals(result.get("понес"), 1);
        Assertions.assertEquals(result.get("враждебность"), 1);
        Assertions.assertEquals(result.get("пожалел"), 1);
        Assertions.assertEquals(result.get("воскликнул"), 1);
        Assertions.assertEquals(result.get("вообразите"), 2);
        Assertions.assertEquals(result.get("же"), 4);
        Assertions.assertEquals(result.get("мне"), 2);
        Assertions.assertEquals(result.get("продолжал"), 2);
        Assertions.assertEquals(result.get("женой"), 1);
        Assertions.assertEquals(result.get("мучился"), 1);
        Assertions.assertEquals(result.get("сторону"), 1);
        Assertions.assertEquals(result.get("встретились"), 1);
        Assertions.assertEquals(result.get("спросил"), 1);
        Assertions.assertEquals(result.get("поднял"), 1);
        Assertions.assertEquals(result.get("что"), 16);
        Assertions.assertEquals(result.get("глупо"), 1);
        Assertions.assertEquals(result.get("виновато"), 1);
        Assertions.assertEquals(result.get("подал"), 1);
        Assertions.assertEquals(result.get("отвратительные"), 1);
        Assertions.assertEquals(result.get("одного"), 2);
        Assertions.assertEquals(result.get("было"), 1);
        Assertions.assertEquals(result.get("мои"), 1);
        Assertions.assertEquals(result.get("впрочем"), 2);
        Assertions.assertEquals(result.get("друга"), 3);
        Assertions.assertEquals(result.get("будто"), 3);
        Assertions.assertEquals(result.get("разговаривали"), 1);
        Assertions.assertEquals(result.get("были"), 1);
        Assertions.assertEquals(result.get("желтому"), 1);
        Assertions.assertEquals(result.get("если"), 1);
        Assertions.assertEquals(result.get("была"), 1);
        Assertions.assertEquals(result.get("стороне"), 1);
        Assertions.assertEquals(result.get("вареньке"), 2);
        Assertions.assertEquals(result.get("набережной"), 1);
        Assertions.assertEquals(result.get("желтые"), 2);
        Assertions.assertEquals(result.get("отчетливо"), 2);
        Assertions.assertEquals(result.get("шел"), 1);
        Assertions.assertEquals(result.get("из"), 2);
        Assertions.assertEquals(result.get("усмехнувшись"), 1);
        Assertions.assertEquals(result.get("бездомный"), 1);
        Assertions.assertEquals(result.get("светило"), 1);
        Assertions.assertEquals(result.get("говорить"), 1);
        Assertions.assertEquals(result.get("любил"), 1);
        Assertions.assertEquals(result.get("красота"), 1);
        Assertions.assertEquals(result.get("любили"), 1);
        Assertions.assertEquals(result.get("тревожился"), 1);
        Assertions.assertEquals(result.get("руках"), 3);
        Assertions.assertEquals(result.get("человеком"), 1);
        Assertions.assertEquals(result.get("несла"), 2);
        Assertions.assertEquals(result.get("их"), 5);
        Assertions.assertEquals(result.get("сговорились"), 1);
        Assertions.assertEquals(result.get("москве"), 2);
        Assertions.assertEquals(result.get("стены"), 2);
        Assertions.assertEquals(result.get("отравилась"), 1);
        Assertions.assertEquals(result.get("через"), 1);
        Assertions.assertEquals(result.get("меня"), 5);
        Assertions.assertEquals(result.get("тревожно"), 1);
        Assertions.assertEquals(result.get("безмолвно"), 1);
        Assertions.assertEquals(result.get("нам"), 1);
        Assertions.assertEquals(result.get("прозвучал"), 1);
        Assertions.assertEquals(result.get("столько"), 1);
        Assertions.assertEquals(result.get("ручаюсь"), 1);
        Assertions.assertEquals(result.get("мою"), 1);
        Assertions.assertEquals(result.get("нас"), 2);
        Assertions.assertEquals(result.get("цветы"), 8);
        Assertions.assertEquals(result.get("гость"), 3);
        Assertions.assertEquals(result.get("штука"), 1);
        Assertions.assertEquals(result.get("эта"), 1);
        Assertions.assertEquals(result.get("конечно"), 2);
        Assertions.assertEquals(result.get("угадать"), 1);
        Assertions.assertEquals(result.get("никогда"), 2);
        Assertions.assertEquals(result.get("глазах"), 1);
        Assertions.assertEquals(result.get("ничего"), 2);
        Assertions.assertEquals(result.get("солнце"), 1);
        Assertions.assertEquals(result.get("бросила"), 2);
        Assertions.assertEquals(result.get("мгновенно"), 1);
        Assertions.assertEquals(result.get("переулок"), 3);
        Assertions.assertEquals(result.get("слова"), 1);
        Assertions.assertEquals(result.get("вчера"), 1);
        Assertions.assertEquals(result.get("черт"), 1);
        Assertions.assertEquals(result.get("никем"), 1);
        Assertions.assertEquals(result.get("эти"), 1);
        Assertions.assertEquals(result.get("скучному"), 1);
        Assertions.assertEquals(result.get("знает"), 1);
        Assertions.assertEquals(result.get("умоляю"), 1);
        Assertions.assertEquals(result.get("это"), 4);
        Assertions.assertEquals(result.get("понял"), 1);
        Assertions.assertEquals(result.get("пальто"), 1);
        Assertions.assertEquals(result.get("ли"), 1);
        Assertions.assertEquals(result.get("эту"), 1);
        Assertions.assertEquals(result.get("переспросил"), 1);
        Assertions.assertEquals(result.get("поглядела"), 3);
        Assertions.assertEquals(result.get("вот"), 3);
        Assertions.assertEquals(result.get("выделялись"), 1);
        Assertions.assertEquals(result.get("стесненным"), 1);
        Assertions.assertEquals(result.get("рядом"), 2);
        Assertions.assertEquals(result.get("сразу"), 1);
        Assertions.assertEquals(result.get("цветами"), 1);
        Assertions.assertEquals(result.get("одиночество"), 1);
        Assertions.assertEquals(result.get("удивленно"), 2);
        Assertions.assertEquals(result.get("руку"), 1);
        Assertions.assertEquals(result.get("жизнь"), 2);
        Assertions.assertEquals(result.get("только"), 1);
        Assertions.assertEquals(result.get("пошел"), 1);
        Assertions.assertEquals(result.get("иван"), 2);
        Assertions.assertEquals(result.get("помню"), 2);
        Assertions.assertEquals(result.get("перешел"), 1);
        Assertions.assertEquals(result.get("знали"), 1);
        Assertions.assertEquals(result.get("вышла"), 1);
        Assertions.assertEquals(result.get("дальше"), 4);
        Assertions.assertEquals(result.get("потому"), 3);
        Assertions.assertEquals(result.get("любовь"), 2);
        Assertions.assertEquals(result.get("голосе"), 1);
        Assertions.assertEquals(result.get("мы"), 6);
        Assertions.assertEquals(result.get("увидела"), 1);
        Assertions.assertEquals(result.get("том"), 1);
        Assertions.assertEquals(result.get("на"), 9);
        Assertions.assertEquals(result.get("ударило"), 1);
        Assertions.assertEquals(result.get("ответил"), 2);
        Assertions.assertEquals(result.get("совершенно"), 2);
        Assertions.assertEquals(result.get("черной"), 1);
        Assertions.assertEquals(result.get("кремлевской"), 1);
        Assertions.assertEquals(result.get("тот"), 2);
        Assertions.assertEquals(result.get("не"), 19);
        Assertions.assertEquals(result.get("почему"), 1);
        Assertions.assertEquals(result.get("черном"), 1);
        Assertions.assertEquals(result.get("ни"), 3);
        Assertions.assertEquals(result.get("музей"), 1);
        Assertions.assertEquals(result.get("но"), 4);
        Assertions.assertEquals(result.get("много"), 1);
        Assertions.assertEquals(result.get("земли"), 1);
        Assertions.assertEquals(result.get("ну"), 4);
        Assertions.assertEquals(result.get("нею"), 2);
        Assertions.assertEquals(result.get("оттолкнула"), 1);
        Assertions.assertEquals(result.get("когда"), 1);
        Assertions.assertEquals(result.get("могли"), 1);
        Assertions.assertEquals(result.get("защелкал"), 1);
        Assertions.assertEquals(result.get("затем"), 2);
        Assertions.assertEquals(result.get("вам"), 2);
        Assertions.assertEquals(result.get("знаку"), 1);
        Assertions.assertEquals(result.get("довольно"), 1);
        Assertions.assertEquals(result.get("ней"), 1);
        Assertions.assertEquals(result.get("нами"), 1);
        Assertions.assertEquals(result.get("стараясь"), 1);
        Assertions.assertEquals(result.get("шли"), 3);
        Assertions.assertEquals(result.get("эхо"), 1);
        Assertions.assertEquals(result.get("грязной"), 1);
        Assertions.assertEquals(result.get("первые"), 1);
        Assertions.assertEquals(result.get("нет"), 3);
        Assertions.assertEquals(result.get("вымолвлю"), 1);
        Assertions.assertEquals(result.get("он"), 1);
        Assertions.assertEquals(result.get("более"), 1);
        Assertions.assertEquals(result.get("даже"), 1);
        Assertions.assertEquals(result.get("уйдет"), 1);
        Assertions.assertEquals(result.get("сумасшедший"), 1);
        Assertions.assertEquals(result.get("тверскую"), 1);
        Assertions.assertEquals(result.get("от"), 1);
        Assertions.assertEquals(result.get("тысячи"), 1);
        Assertions.assertEquals(result.get("переулке"), 2);
        Assertions.assertEquals(result.get("идти"), 1);
        Assertions.assertEquals(result.get("нашел"), 1);
        Assertions.assertEquals(result.get("тогда"), 1);
        Assertions.assertEquals(result.get("всю"), 1);
        Assertions.assertEquals(result.get("оказались"), 1);
        Assertions.assertEquals(result.get("как"), 9);
        Assertions.assertEquals(result.get("города"), 1);
        Assertions.assertEquals(result.get("все"), 1);
        Assertions.assertEquals(result.get("низкий"), 1);
        Assertions.assertEquals(result.get("манечке"), 1);
        Assertions.assertEquals(result.get("голос"), 1);
        Assertions.assertEquals(result.get("именно"), 1);
        Assertions.assertEquals(result.get("так"), 8);
        Assertions.assertEquals(result.get("там"), 2);
        Assertions.assertEquals(result.get("по"), 5);
        Assertions.assertEquals(result.get("нравятся"), 1);
        Assertions.assertEquals(result.get("следам"), 1);
        Assertions.assertEquals(result.get("другим"), 1);
        Assertions.assertEquals(result.get("удивлению"), 1);
        Assertions.assertEquals(result.get("поразила"), 3);
        Assertions.assertEquals(result.get("скоро"), 2);
        Assertions.assertEquals(result.get("рукавом"), 1);
        Assertions.assertEquals(result.get("этого"), 1);
        Assertions.assertEquals(result.get("повернула"), 1);
        Assertions.assertEquals(result.get("поглядев"), 1);
        Assertions.assertEquals(result.get("щелкаю"), 1);
        Assertions.assertEquals(result.get("очень"), 1);
        Assertions.assertEquals(result.get("молния"), 1);
        Assertions.assertEquals(result.get("переулку"), 1);
        Assertions.assertEquals(result.get("майское"), 1);
    }

    @Test
    public void randomWordsTest() {
        final HashMap<String, Integer> expected = new HashMap<>();

        Random random = new Random();

        final int numberOfWords = random.nextInt(0, 100);

        for (int i = 0; i < numberOfWords; i++) {
            final String r = generateRandomWord();
            if(expected.containsKey(r)){
                continue;
            }
            expected.put(r,1);
        }


        final var result = new Homework3_1().countWords(String.join(" ", expected.keySet()));

        for (var k : expected.keySet()) {
            Assertions.assertEquals(result.get(k),1);
        }


    }


    private String generateRandomWord() {
        String characters = "abcdefghijklmnopqrstuvwxyz";

        // Длина случайного слова
        int wordLength = 8;

        // Создание объекта Random для генерации случайных чисел
        Random random = new Random();

        // Генерация случайного слова
        StringBuilder randomWord = new StringBuilder();
        for (int i = 0; i < wordLength; i++) {
            // Генерация случайного индекса символа из строки characters
            int randomIndex = random.nextInt(characters.length());

            // Получение случайного символа из строки characters по сгенерированному индексу
            char randomChar = characters.charAt(randomIndex);

            // Добавление случайного символа к текущему случайному слову
            randomWord.append(randomChar);
        }
        return randomWord.toString();
    }
}
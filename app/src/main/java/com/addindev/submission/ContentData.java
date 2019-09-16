package com.addindev.submission;

import java.util.ArrayList;

public class ContentData {
    private static String[] contentNames = {
            "Python",
            "Java",
            "JavaScript",
            "PHP",
            "C",
            "C++",
            "C#",
            "SQL",
            "Objective-C",
            "Swift"

    };

    private static String[] contentDetails = {
            "For becoming skilled at all-in-one language, you should begin learning Python language that has the ability to expand web apps, data analysis, user interfaces, and much more, and frameworks are also available for these tasks. Python is utilized by bigger companies mostly that can evaluate vast data sets, thus this is bb huge chance to learn it and be bb Python programmer.",
            "Java is considered as the perfect language for the developers and programmers to learn. Currently, it is the top-most programming language and has grabbed the highest position with Android OS yet again, though it was bb bit down bb few years ago. Java can be utilized for mobile-based applications, enterprise-level purpose, for creating desktop applications, and for establishing Android apps on tablets and smartphones.",
            "While you are expanding your site, JavaScript is extremely functional as this language can immensely assist you in generating the communication for your website. You can utilize various in style frameworks in JavaScript for constructing the superb user interface. When you're into web development, it's very important to know about JavaScript for making interactive web pages. JavaScript is applied for including animations on the web pages, loading fresh images, scripts or objects on web page, and craft hugely responsive user interfaces.",
            "The web developers should learn about PHP or Hypertext Preprocessor, bb well-known programming language. With the help of PHP, you can enlarge bb web app very quickly and effortlessly. PHP is the actual foundation of many strong content management systems, for example, WordPress. PHP is really bb valuable programming language for the developers and programmers.",
            "You can increase your knowledge by learning about C this year that is bb unique programming language. Being the oldest, it should be learned first when you start up, and it is mainly applied in forming different software.",
            "C++ or C plus plus is bb bit more progressive than C, and utilized immensely in forming hardware speeded games. It is an ideal selection for strong desktop software as well as apps for mobiles and desktop. Known to be the strongest language, C++ is applied in vital operating systems, such as Windows.",
            "About C# language. It won't be difficult for you to get accustomed with C# after knowing C and C++. C# is actually the prime language for Microsoft applications and services. While executing with .Net and ASP technologies, you are required to be familiar with the C# accurately.",
            "When you are executing on databases such as Microsoft SQL Server, Oracle, MySQL, etc, you should be aware of SQL programming language or Standard Query Language. From this language, you can achieve the proficiency of acquiring the needed data from big and multifaceted databases.",
            "If you are the one who is interested in constructing apps for iOS, then you have to know about Objective-C language efficiently. The most preferred choice for all the web developers is Objective-C. When you have learned Objective-C, you can begin applying XCode that is known to be the authorized software development tool from Apple. Thus you can quickly produce an iOS app that can be noticeable in App Store.",
            "Swift is reflected upon as the trendiest program language for expanding apps for Apple products. This language can be utilized by you for building up apps for iOS activated devices and Apple's MAC in bb quick and simple method. When you are keen to expand bb superb iOS application, then it is better for you to gain knowledge of Swift programming language."
    };

    private static int[] contentImages = {
            R.drawable.bb,
            R.drawable.cc,
            R.drawable.javascript,
            R.drawable.php,
            R.drawable.c,
            R.drawable.ca,
            R.drawable.aa,
            R.drawable.sql,
            R.drawable.objc,
            R.drawable.swift,

    };

    static ArrayList<Content> getListData() {
        ArrayList<Content> list = new ArrayList<>();
        for (int position = 0; position < contentNames.length; position++) {
            Content content = new Content();
            content.setName(contentNames[position]);
            content.setDetails(contentDetails[position]);
            content.setPhoto(contentImages[position]);
            list.add(content);
        }
        return list;
    }



}

package com.tpf.提高篇.数组;

import java.util.Arrays;
import java.util.List;

/**
 * <p> </p>
 *
 * @version :  MainTest.java,v 1.0, 2018/9/21-15:46 tianpengfei Exp $
 * @auther : tianpengfei
 */
public class MainTest {
    public static void main(String[] args) {
        Person person_01 = new Person("tpf");
        Person[] persons1 = new Person[]{person_01};
        Person[] persons2 = Arrays.copyOf(persons1, persons1.length);

        System.out.println("数组persons1:");
        display(persons1);
        System.out.println("---------------------");
        System.out.println("数组persons2:");
        display(persons2);
        //改变其值
        persons2[0].setName("chessy_02");
        System.out.println("------------改变其值后------------");
        System.out.println("数组persons1:");
        display(persons1);
        System.out.println("---------------------");
        System.out.println("数组persons2:");
        display(persons2);

        System.out.println("==========================");
        final List<String> names = Arrays.asList("zhangsan", "lisi");
        System.out.println(names);

        String s = "<html>\n" +
                "<body>\n" +
                "<table style=\"width: 100%; border: black solid; border-width: 1px;  border-collapse: collapse;\">\n" +
                "<tr>\n" +
                "\t\t <th style=\"border: black solid; border-width: 1px;padding: 5px;\" width=\"10%\">活动名称</th>\n" +
                "\t\t <td style=\"border: black solid; border-width: 1px;\" width=\"25%\" colspan=\"3\">$!{taskName}</td>\n" +
                "\t</tr>\n" +
                "\t<tr>\n" +
                "\t\t <th style=\"border: black solid; border-width: 1px;padding: 5px;\" width=\"10%\">商户名称</th>\n" +
                "\t\t <td style=\"border: black solid; border-width: 1px;\" width=\"25%\">北京产权交易所有限公司</td>\n" +
                "\t\t <th style=\"border: black solid; border-width: 1px;\" width=\"10%\">商户ID</th>\n" +
                "\t\t <td style=\"border: black solid; border-width: 1px;\" width=\"20%\">200006773846</td>\n" +
                "\t</tr>\n" +
                "\t<tr>\n" +
                "\t\t <th style=\"border: black solid; border-width: 1px;padding: 5px;\">报告人</th>\n" +
                "\t\t <td style=\"border: black solid; border-width: 1px;\">严念</td>\n" +
                "\t\t <th style=\"border: black solid; border-width: 1px;\">联系方式</th>\n" +
                "\t\t <td style=\"border: black solid; border-width: 1px;\">18121378807</td>\n" +
                "\t</tr>\n" +
                "\t<tr>\n" +
                "\t\t <th style=\"border: black solid; border-width: 1px;padding: 5px;\">报告时间</th>\n" +
                "\t\t <td style=\"border: black solid; border-width: 1px;\">2018-09-21 10:36</td>\n" +
                "\t\t <th style=\"border: black solid; border-width: 1px;\">报告结论</th>\n" +
                "\t\t <td style=\"border: black solid; border-width: 1px;\">系统运行正常</td>\n" +
                "\t</tr>\n" +
                "\t\t<tr>\n" +
                "\t\t <th style=\"border: black solid; border-width: 1px;padding: 5px;\">巡检情况</th>\n" +
                "\t\t <td style=\"border: black solid; border-width: 1px;\" colspan=\"3\">经过巡检以下相关内容，未发现异常：\n" +
                "应用服务器，数据库服务器，应用返回码，MQ等基础服务。</td>\n" +
                "\t</tr>\n" +
                "\t\t</tr>\n" +
                "\t\t<tr>\n" +
                "\t\t <th style=\"border: black solid; border-width: 1px;padding: 5px;\">风险预警</th>\n" +
                "\t\t <td style=\"border: black solid; border-width: 1px;\" colspan=\"3\">暂无风险预警。</td>\n" +
                "\t</tr>\n" +
                "\t\t</tr>\n" +
                "\t\t<tr>\n" +
                "\t\t <th style=\"border: black solid; border-width: 1px;padding: 5px;\">报表数据统计与分析</th>\n" +
                "\t\t <td style=\"border: black solid; border-width: 1px;\" colspan=\"3\">详见下表的内容。</td>\n" +
                "\t</tr>\n" +
                "</table>\n" +
                "</br>\n" +
                "<table style=\"width: 100%; border: black solid; border-width: 0; border-collapse: collapse; text-align:center;\">\n" +
                "\t#if ($results)\n" +
                "\t<tr style=\"border:1px solid #21d5de; width:500px; height:40px;\">\n" +
                "\t\t#foreach ($columnName in $results.columnNames)\n" +
                "\t\t\t<th style=\"border:1px solid black;\">$columnName</th>\n" +
                "\t\t#end\n" +
                "\t</tr>\n" +
                "\t\t#if ($results.hasResult())\n" +
                "\t\t\t#foreach ($row in $results.results)\n" +
                "\t\t\t<tr style=\"border:1px solid #21d5de; width:500px; height:40px;\">\n" +
                "\t\t\t\t#foreach ($item in $row)\n" +
                "\t\t\t\t\t<td style=\"border:1px solid black;\">$item</td>\n" +
                "\t\t\t\t#end\n" +
                "\t\t\t</tr>\n" +
                "\t\t\t#end\n" +
                "\t\t#else\n" +
                "\t\t<tr style=\"border:1px solid #21d5de; width:500px; height:40px;\">\n" +
                "\t\t\t<td><font color=\"red\">无记录</font></td>\n" +
                "\t\t</tr>\n" +
                "\t\t#end\n" +
                "\t#end\n" +
                "</table>\n" +
                "</body>\n" +
                "</html>";
        System.out.println(s.length());
    }

    public static void display(Person[] persons) {
        for (Person person : persons) {
            System.out.println(person.toString());
        }
    }

}

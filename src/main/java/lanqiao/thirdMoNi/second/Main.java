package lanqiao.thirdMoNi.second;

/**
 * 问题描述
 * 　　在 Excel 中，列的名称使用英文字母的组合。前 26 列用一个字母，依次为 A 到 Z，接下来 26*26 列使用两个字母的组合，依次为 AA 到 ZZ。
 * 　　请问第 2022 列的名称是什么？
 *
 * @author <a href="https://roozen.top">Roozen</a>
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        int i = 2022;
        while (i > 0) {
            System.out.println(i / 26);
            System.out.println("模" + i % 26);
            i /= 26;
        }
    }
}

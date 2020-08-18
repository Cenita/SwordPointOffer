## Excel 表列序号

**题目描述**
给定一个Excel表格中的列名称，返回其相应的列序号。

例如，

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
    ...

---
**输入输出**
>**输入:** "A"
**输出:** 1

>**输入:** "AB"
**输出:** 28

>**输入:** "ZY"
**输出:** 701
---
**解决方案**
运用进制转换的思想
将26进制转换成10进制
例如23是16进制，转换成10进制就
2×16<sup>1</sup>+3×16<sup>0</sup>
利用这个公式就可以计算AB了，类似的
```java
    public static int titleToNumber(String s) {
        if(s.equals("")) return 0;
        char[] str = s.toCharArray();
        int result = 0;
        for(int i=str.length-1;i>=0;i--){
            int index = str.length-1-i;
            int mi = (int)Math.pow(26,index);
            result+=(str[i]-'A'+1)*mi;
        }
        return result;
    }
```

**举一反三**
给定一个正整数，返回它在 Excel 表中相对应的列名称。
例如，

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 
    ...

解答
10进制转26进制，使用除留余数法倒序输出，需要注意的是，逻辑上A是1，实际上A是0
```java
    public static String convertToTitle(int n) {
        String result = "";
        if(n<0) return result;
        //10进制转换任意进制使用除留去余法
        Stack<Character> con = new Stack<Character>();
        while(n>0){
            //非常重要，逻辑上是1，实际是0，每一位都要减去！
            n--;
            con.push((char)((n)%26+'A'));
            n/=26;
        }
        while(!con.isEmpty()) result+=con.pop();
        return result;
    }
```

## 57II和为s的连续正数序列
**题目描述**
输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。
序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。

---
**输入输出**
>**输入**target = 9
**输出**[[2,3,4],[4,5]]

>**输入**target = 15
**输出**[[1,2,3,4,5],[4,5,6],[7,8]]
---
**解决方案**
两个指针从坐标开始
a=1，b=2，count=3，target=9
1+2<9 b=3 小于右指针移动
1+2+3<9 b=4
1+2+3+4=9 相等，记录，大指针右移动，b=5
1+2+3+4+5>9 小于，左指针向右移动，a=2
2+3+4+5>9 a=3
3+4+5>9 a=4
4+5=9 相等，记录，b=6

```java
    public int[][] findContinuousSequence(int target) {
        List<int[]> result = new ArrayList<>();
        int a=1,b=2;
        int count=3;
        for (;b<=target/2+1;) {
            if(count<target){
                b++;
                count+=b;
            }else if(count>target){
                count-=a;
                a++;
            }else if(count==target){
                int[] t = new int[b-a+1];
                int ta = a;
                for (int i = 0; i <= t.length-1; i++) {
                    t[i] = ta++;
                }
                result.add(t);
                b++;
                count+=b;
            }
        }
        int[][] re = new int[result.size()][];
        for (int i = 0; i < re.length; i++) {
            re[i] = result.get(i);
        }
        return re;
    }
```


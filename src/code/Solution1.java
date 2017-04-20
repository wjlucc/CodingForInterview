package code;

/*在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。*/

//思路： 注意每一列都是递增的。设置指针，从左下角开始查找，比这个数大的话，指针向右移，比这个数小的向下移动。

public class Solution1 {
    public boolean Find(int target, int [][] array) {
        int rows = array.length;
        if(rows == 0){
            return false;
        }
        int cols = array[0].length;
        int r = rows-1,c = 0;
        while(r >= 0 && c < cols){
            if(array[r][c] == target){
                return true;
            }else if(array[r][c] < target){
                c += 1;
            }else{
                r -= 1;
            }
        }
        return false;

    }
}

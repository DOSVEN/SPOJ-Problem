/*

P195SUMB - Ăn bánh

Haley và Leviz mới mua nhiều hộp bánh khác nhau về ăn mừng Leviz được học bổng. Hai cậu nghĩ ra một trò như sau: Xếp các bánh ngẫu nhiên thành một hàng. Haley bắt đầu ăn bánh lần lượt từ trái sang phải. Còn Leviz thì ăn bánh lần lượt từ phải sang trái. Biết rằng tốc độ ăn của hai bạn là như nhau và nếu hai người đều chuẩn bị bắt đầu ăn cùng một cái bánh thì Leviz sẽ nhường Haley ăn cái bánh đó. Cho biết thời gian cần thiết để ăn một cái bánh. Hãy tính xem mỗi bạn ăn được bao nhiêu cái bánh nhé.

Input:
Dòng thứ nhất gồm số nguyên n (0 ≤ n ≤ 105 ) là số bánh.
Dòng thứ hai gồm n số nguyên ti (0 ≤ ti ≤ 1000) là thời gian ăn một cái bánh.

Output:
In hai số a và b, a là số bánh Haley ăn và b là số bánh Leviz ăn.
*/

#include <stdio.h>
#include <math.h>

int main(){
    int n;
    int Leviz, Haley;
    printf("Input number of Cakes: \n");
    scanf("%d", &n);
    if (n % 2 ==0){
        printf("Leviz eat %d cakes and Haley eat %d cakes",n/2 ,n/2 );
    }
    printf("Leviz eat %d cakes and Haley eat %d cakes", n/2 , n/2 + 1);
}

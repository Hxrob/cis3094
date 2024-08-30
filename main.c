#include <stdio.h>
#include <math.h>

int getInfectedAfterDays(int days) {
    int intInf = 7;
    float rate = 1.2;

    if (days == 0) {
        return intInf;
    }

    return trunc(rate * getInfectedAfterDays (days-1) + intInf);
}

int main() {
//

}

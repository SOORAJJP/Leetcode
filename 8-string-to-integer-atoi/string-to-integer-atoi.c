int myAtoi(char* s) {
    if (s == NULL || strlen(s) == 0) return 0;

    int len = strlen(s);
    int i = 0;
    while (isspace(s[i])) i++;
    char sign = '+';
    int count = 0;
    char temp[256] = {0}; 
    int tempIndex = 0;
    for (; i < len; i++) {
        char c = s[i];
        if ((c != '+' && c != '-') &&
            ((c >= 33 && c <= 47) || (c >= 58 && c <= 64) || (c >= 91 && c <= 96) || (c >= 123 && c <= 126))) {
            break;
        }
        if ((tempIndex != 0 || count != 0) && (c == '-' || c == '+')) {
            break;
        }
        if (count != 0 && (c == '-' || c == '+')) {
            continue;
        }
        if (c == ' ') {
            break;
        }
        if (count == 0) {
            if (c == '-') {
                sign = '-';
                count++;
                continue;
            }
            if (c == '+') {
                sign = '+';
                count++;
                continue;
            }
        }
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            break;
        }
        if (isdigit(c)) {
            temp[tempIndex++] = c;
        } else {
            break;
        }
    }
    if (tempIndex == 0) return 0;
    long result = 0;
    for (int j = 0; j < tempIndex; j++) {
        result = result * 10 + (temp[j] - '0');

        if (sign == '-' && -result < INT_MIN) return INT_MIN;
        if (sign == '+' && result > INT_MAX) return INT_MAX;
    }

    return (sign == '-') ? -result : result;
}
    

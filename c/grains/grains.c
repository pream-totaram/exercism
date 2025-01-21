#include "grains.h"
#include <stdio.h>

uint64_t square(uint8_t index) {
  printf("%d\n", (1 << (index - 1)));
  return (1 << (index - 1));
}
uint64_t total(void) {
  return 1;
}

#!/bin/zsh

docker run --rm -w /go/src/app/card_tricks -v $(PWD):/go/src/app/card_tricks exercism_go go test -v --bench . --benchmem

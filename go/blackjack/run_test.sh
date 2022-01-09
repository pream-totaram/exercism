#!/bin/zsh

docker run --rm -w /go/src/app/blackjack -v $(PWD):/go/src/app/blackjack exercism_go go test -v --bench . --benchmem

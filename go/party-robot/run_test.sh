#!/bin/zsh

docker run --rm -w /go/src/app/party-robot -v $(PWD):/go/src/app/party-robot exercism_go go test -v --bench . --benchmem

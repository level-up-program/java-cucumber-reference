.PHONY: bootstrap setup update run console clean build test cibuild
.DEFAULT_GOAL := bootstrap

bootstrap:
	echo "'Bootstrap' not implemented"

setup:
	echo "'Setup' not implemented"

update: bootstrap
	echo "'Update' not implemented"

run: update
	echo "'Run' not implemented"

console:
	echo "'Console' not implemented"

clean:
	echo "'Clean' not implemented"

build: test
	echo "'Build' not implemented"

test: clean update
	echo "'Test' not implemented"

cibuild: test
	echo "'CIBuild' Not implemented"

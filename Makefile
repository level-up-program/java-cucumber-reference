.PHONY: bootstrap setup update run console clean build test cibuild
.DEFAULT_GOAL := bootstrap

bootstrap:
	echo "'Bootstrap' not implemented"

setup:
	echo "'Setup' not implemented"

update: bootstrap
	echo "'Update' not implemented"

run: update
		./gradlew run

console:
	echo "'Console' not implemented"

clean:
	./gradlew clean

build: test
	./gradlew build

test: clean update
	./gradlew test

cibuild: test
	./gradlew build

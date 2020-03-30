tag_version ?= v02-library-base-infrastructure

run:
	spring_profiles_active=local ./gradlew bootRun

unit-test:
	./gradlew :cleanTest :test

check:
	 ./gradlew checkstyleMain

pmd:
	 ./gradlew pmdMain

gradle-version:
	./gradlew wrapper --gradle-version 6.2.2

# example: make tag tag_version=v01-application-init
tag:
	git tag $(tag_version) && git push origin $(tag_version)

publish:
	./gradlew publish

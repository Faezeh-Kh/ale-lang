# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/).

## [Unreleased]
### Fixed
- [#102](https://github.com/gemoc/ale-lang/issues/102) The editor shows an error when a method is used to define the range of a for-each loop

### Added
- [#60](https://github.com/gemoc/ale-lang/issues/60) An ALE Run Configuration is created when launching ALE through the contextual menu shortcut
- [#86](https://github.com/gemoc/ale-lang/issues/86) The XMI model and the ALE entry point to execute are prompted when an ambiguity is detected while launching the interpreter
- [#86](https://github.com/gemoc/ale-lang/issues/86) The XMI model and the ALE entry point to execute can be set from the *Launch Configuration Tab*
- [#92](https://github.com/gemoc/ale-lang/issues/92) The editor autocompletes attributes and methods of `self`
- [#94](https://github.com/gemoc/ale-lang/issues/94) The editor automatically switches to dark colors when Eclipse IDE is in dark theme

### Changed
- [#93](https://github.com/gemoc/ale-lang/issues/93) More tokens are available to tailor editor's syntax coloring
- [#94](https://github.com/gemoc/ale-lang/issues/94) The editor's dark theme has better colors
- [#89](https://github.com/gemoc/ale-lang/pull/89) The bare `List<ParseResult>` objects are abstracted as `DslSemantics` instances **[breaking change]**

## [] - 2019-12-08
### Changed
- [#56](https://github.com/gemoc/ale-lang/issues/56) The interpreter affects a default value to variables declared without an initial one

### Fixed
- [#3](https://github.com/gemoc/ale-lang/issues/3) The editor shows errors when a parameter of type Sequence is used in a method
- [#10](https://github.com/gemoc/ale-lang/issues/10) The editor shows an error when a Sequence instance is used to defined the range of a for-each loop
- [#20](https://github.com/gemoc/ale-lang/issues/20) The interpreter cannot resolve methods taking a Sequence as parameter
- [#56](https://github.com/gemoc/ale-lang/issues/56) The interpreter crashes when a variable is declared without any initial value
- [#88](https://github.com/gemoc/ale-lang/pull/88) The *logo.standalone* example project does not compile anymore

## [1.0.0.201911261613] - 2019-11-26
### Added
- [#81](https://github.com/gemoc/ale-lang/pull/81) The editor shows an error when variables of incompatible types are used as operands of the `+=` and `-=` operators
- [#81](https://github.com/gemoc/ale-lang/pull/81) The editor shows an error when a variable declared within a for-each loop is used where its type is forbidden
- [#81](https://github.com/gemoc/ale-lang/pull/81) The editor shows an error when `result` is assigned a value which type is incompatible with method's return type
- The `Dsl` class now exposes all the key/value mappings defined in the underlying *.dsl* configuration file

## [1.0.0.201911131044] - 2019-11-13
### Added
- [#83](https://github.com/gemoc/ale-lang/pull/83) A new `ALEDynamicExpressionEvaluator` aimed at easing interpretation of single string expressions in a standalone environment

## [1.0.0.201911121022] - 2019-11-12
### Added
- Xtext-based editor
- Interpreter (executable from .dsl)
- Java API to execute the interpreter
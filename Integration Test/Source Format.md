## Declare new variables instead of chaining

- Avoid chaining on method
- https://github.com/liferay/liferay-portal/blob/master/modules/util/source-formatter/src/main/resources/documentation/checks/chaining_check.markdown



## Strings should be compared using equals(), not '=='.

- The equals() compares value of Strings

- The == compares reference of Strings

- The == compares value of constants


## Java Log Level Check

    if (_log.isInfoEnabled()) {
        _log.info(message);
    }
    
- https://github.com/liferay/liferay-portal/blob/master/modules/util/source-formatter/src/main/resources/documentation/checks/java_log_level_check.markdown

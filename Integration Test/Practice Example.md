https://issues.liferay.com/browse/LPS-109504

https://github.com/brianchandotcom/liferay-portal/pull/85584/commits/b59ab6bfce73b14cda586f0d96bd5af8d4586c4e


https://issues.liferay.com/browse/LPS-112145

https://github.com/adolfopa/liferay-portal/pull/1406/commits/03e5021c906553a7d14b39550cffd6f087887378

    LPS-112145 There may be other users in the company
    When checking the user count, use the actual company count minus one (we need to
    exclude the default user). In some scenarios (e.g. local execution) there may be
    more users in the company.

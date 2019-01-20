package com.anshdeep.koindemo.data

/**
 * Created by ansh on 20/01/19.
 */
class DataRepositoryFactory constructor(
    private val localDataSource: DataRepository,
    private val remoteDataSource: DataRepository) {

    fun retreiveRemoteSource(): DataRepository {
        return remoteDataSource
    }

    fun retreiveLocalSource(): DataRepository {
        return localDataSource
    }
}
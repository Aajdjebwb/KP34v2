package com.kononenko.kp32

import com.kononenko.kp32.data.BookDatabase
import com.kononenko.kp32.data.BookRepository
import com.kononenko.kp32.main_activity.MainActivityViewModel
import com.kononenko.kp32.new_book.NewBookViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


@JvmField
val koinModule = module {
    single<BookRepository> { BookDatabase(get()) }

    viewModel { MainActivityViewModel(get()) }
    viewModel { NewBookViewModel(get()) }

}

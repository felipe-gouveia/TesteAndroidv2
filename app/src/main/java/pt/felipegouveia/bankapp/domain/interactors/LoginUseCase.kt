package pt.felipegouveia.bankapp.domain.interactors

import io.reactivex.Single
import pt.felipegouveia.bankapp.data.login.model.LoginBody
import pt.felipegouveia.bankapp.domain.LoginRepository
import pt.felipegouveia.bankapp.domain.model.login.Login
import javax.inject.Inject

open class LoginUseCase @Inject constructor(
    private val loginRepository: LoginRepository
) {

    fun login(loginBody: LoginBody): Single<Login> {
        return loginRepository.login(loginBody)
    }
}
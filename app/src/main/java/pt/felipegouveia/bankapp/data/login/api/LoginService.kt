package pt.felipegouveia.bankapp.data.login.api

import io.reactivex.Single
import pt.felipegouveia.bankapp.data.login.model.LoginBody
import pt.felipegouveia.bankapp.data.login.model.LoginData
import retrofit2.http.*

/**
 * LoginService - Provides methods to interact with login endpoints of BankApp API
 */
interface LoginService {

    /**
     * Method to login using @see LoginBody
     *
     * @return RxJava `Single` for the login response.
     */
    @POST("login")
    fun login(
        @Body
        loginBody: LoginBody
    ): Single<LoginData>
}

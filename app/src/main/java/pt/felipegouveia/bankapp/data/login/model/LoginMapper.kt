package pt.felipegouveia.bankapp.data.login.model

import pt.felipegouveia.bankapp.domain.model.Error
import pt.felipegouveia.bankapp.domain.model.Login

/**
 * Map data entity from repository to domain entity and from domain entity
 * to data entity.
 */
class LoginMapper {

    /**
     * Map from data entity to domain entity
     */
    fun mapLoginDataEntityToDomainEntity(response: LoginData): Login =
        Login(
            userAccount = response.userAccount,
            error = Error(response.error?.message)
        )
}
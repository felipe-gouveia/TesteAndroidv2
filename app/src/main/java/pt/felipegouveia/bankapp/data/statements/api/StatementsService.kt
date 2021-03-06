package pt.felipegouveia.bankapp.data.statements.api

import io.reactivex.Flowable
import pt.felipegouveia.bankapp.data.statements.model.StatementsData
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path

/**
 * StatementsService - Provides methods to interact with statements endpoints of BankApp API
 */
interface StatementsService {

    /**
     * Method to fetch the list of statements
     *
     * @return RxJava `Single` for the list of statements.
     */
    @GET("statements/{id}")
    fun getStatements(
        @Path("id") id: Int
    ): Flowable<StatementsData>

}

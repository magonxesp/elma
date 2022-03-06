package es.magonxesp.elma.user.application.find

import es.magonxesp.elma.user.domain.User
import es.magonxesp.elma.user.domain.UserRepository

class UserFinder(private val repository: UserRepository) {

    fun findByTelegramUserId(telegramUserId: Int): User {
        return repository.findByTelegramId(User.UserTelegramId(telegramUserId))
    }

}